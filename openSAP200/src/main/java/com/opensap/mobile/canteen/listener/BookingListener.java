package com.opensap.mobile.canteen.listener;

import com.sap.cloud.server.odata.*;

public class BookingListener extends com.sap.cloud.server.odata.DefaultEntityListener {
    private com.opensap.mobile.canteen.MainServlet servlet;
    private com.opensap.mobile.canteen.proxy.ComOpensapMobileCanteenService service;

    public BookingListener(com.opensap.mobile.canteen.MainServlet servlet, com.opensap.mobile.canteen.proxy.ComOpensapMobileCanteenService service) {
        super();
        this.servlet = servlet;
        this.service = service;
        allowUnused(this.servlet);
        allowUnused(this.service);
    }

    @Override public void beforeQuery(DataQuery query) {
        allowUnused(query);
    }

    public void beforeSave(EntityValue entityValue) {
        // Shared code for beforeCreate / beforeUpdate.
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        allowUnused(entity);
    }

    @Override public void beforeCreate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeUpdate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        allowUnused(entity);
        beforeSave(entity);
    }

    @Override public void beforeDelete(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        allowUnused(entity);
    }

    public void afterSave(EntityValue entityValue) {
        // Shared code for afterCreate / afterUpdate.
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        allowUnused(entity);
    }

    @Override public void afterCreate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterUpdate(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        allowUnused(entity);
        afterSave(entity);
    }

    @Override public void afterDelete(EntityValue entityValue) {
        com.opensap.mobile.canteen.proxy.Booking entity = (com.opensap.mobile.canteen.proxy.Booking)entityValue;
        allowUnused(entity);
    }
}
