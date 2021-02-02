package com.opensap.mobile.canteen.handler;

import com.sap.cloud.server.odata.*;

public class BookLunchHandler extends com.sap.cloud.server.odata.DefaultMethodHandler {
    private com.opensap.mobile.canteen.MainServlet servlet;
    private com.opensap.mobile.canteen.proxy.CanteenService service;

    public BookLunchHandler(com.opensap.mobile.canteen.MainServlet servlet, com.opensap.mobile.canteen.proxy.CanteenService service) {
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
        // Method implementation code should be placed here...
        throw DataServiceException.notImplemented("BookLunch");
    }
}
