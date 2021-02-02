package com.opensap.mobile.canteen.handler;

import com.opensap.mobile.canteen.proxy.Booking;
import com.opensap.mobile.canteen.proxy.Menu;
import com.sap.cloud.server.odata.*;

import com.opensap.mobile.canteen.proxy.Booking;
import com.opensap.mobile.canteen.proxy.Menu;
import com.sap.cloud.server.odata.BooleanValue;
import com.sap.cloud.server.odata.DataMethod;
import com.sap.cloud.server.odata.DataValue;
import com.sap.cloud.server.odata.LongValue;
import com.sap.cloud.server.odata.ParameterList;
import com.sap.cloud.server.odata.StringValue;
import com.sap.cloud.server.odata.http.HttpRequest;
import com.sap.cloud.server.odata.json.JsonObject;
import com.sap.cloud.server.odata.json.JsonValue;

public class BookLunchHandler extends com.sap.cloud.server.odata.DefaultMethodHandler {
    private com.opensap.mobile.canteen.MainServlet servlet;
    private com.opensap.mobile.canteen.proxy.ComOpensapMobileCanteenService service;

    //System get-env-......
private static String BASEURL = "https://mobile-service-c2g.cfapps.eu10.hana.ondemand.com/e2114c6f-9998-4604-a3dd-30de602e997f/mobileservices/origin/hcpms/CARDS/v1/register/templated"; //Please remove the square brackets
private static String APIKEY = "1345c3516276d9b0cbc126ad8c11bba6af2b5c03683d19d4f6744d53781effe1"; //Please remove the square brackets
private static String ALIAS = "CanteenBooking";

    public BookLunchHandler(com.opensap.mobile.canteen.MainServlet servlet, com.opensap.mobile.canteen.proxy.ComOpensapMobileCanteenService service) {
        super(servlet, service);
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public DataValue executeMethod(DataMethod method, ParameterList parameters) {
        long MenuID = LongValue.unwrap(parameters.getRequired("MenuID"));
        String UserID = StringValue.unwrap(parameters.getRequired("UserID"));
        boolean input = bookLunch(MenuID, UserID);
        return BooleanValue.of(input);
    }

    public boolean bookLunch(long MenuID, String UserID) {
      //Load Lunch to retrieve Price
        Menu m = service.getMenuWithKey(MenuID);
        
        Booking booking = new Booking();
        booking.setMenuID(m.getMenuID());
        booking.setPrice(m.getPrice());
        booking.setBookingDate(this.servlet.backendTimeNow().toLocal());
        booking.bindEntity(m, Booking.menuBooked);
        booking.setUser(UserID);
        booking.setStatus("booked");
        service.createEntity(booking); //this acutally touches the DB

        

        //Send confirmation card to user
JsonObject requestBody = new JsonObject();
JsonObject parameterBody = new JsonObject();

String cardTemplateName = "LunchReceipt"; //If you have given your card a different name, please change the name here.

parameterBody.set("ID1", JsonValue.fromString(booking.getBookingID() + ""));
requestBody.set("method", JsonValue.fromString("REGISTER"));
requestBody.set("username", JsonValue.fromString(UserID));
requestBody.set("templateName", JsonValue.fromString(cardTemplateName));
requestBody.set("match", JsonValue.fromString("BookingSet("+booking.getBookingID()+")"));
requestBody.set("parameters", parameterBody);

HttpRequest request = new HttpRequest();
request.open("POST", BookLunchHandler.BASEURL);

request.setRequestHeader("Content-Type", "application/json");
request.setUsername(BookLunchHandler.ALIAS);
request.setPassword(BookLunchHandler.APIKEY);
request.setRequestText(requestBody.toString());

request.send();

int status = request.getStatus();

request.close();

//Response handling 
if ((status > 200) && (status <= 210)) {
    return true;
}
//Todo: Add proper error handling
return false; 
    }
}
