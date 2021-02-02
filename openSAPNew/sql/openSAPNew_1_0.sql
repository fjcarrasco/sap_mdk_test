-- generated by csdl-to-sql for target pgsql from com.opensap.mobile.canteen.csdl.xml

create sequence "openSAPNew_BookingSet_1_0_id_seq" start with 1 increment by 1;

create table "openSAPNew_BookingSet_1_0"
(
    "BookingDate" timestamp with time zone not null,
    "BookingID" serial not null,
    "MenuID" bigint not null,
    "Price" decimal(10,2) not null,
    "Status" varchar(80) not null,
    "User" varchar(400) not null,
    "row_version" bigint not null,
    "is_deleted" boolean not null,
    "last_modified" timestamp with time zone not null,
    primary key ("BookingID")
);

create index "openSAPNew_BookingSet_1_0_last_modified_index" on "openSAPNew_BookingSet_1_0" ("last_modified");

create sequence "openSAPNew_xs_data_metrics_1_0_id_seq" start with 1 increment by 1;

create table "openSAPNew_xs_data_metrics_1_0"
(
    "id" serial not null,
    "start" timestamp with time zone not null,
    "period" decimal(20,6) not null,
    "process" varchar(400) not null,
    "provider" varchar(400) not null,
    "component" varchar(800) not null,
    "metric" varchar(400) not null,
    "unit" varchar(200) not null,
    "count" bigint null,
    "sum" bigint null,
    "average" decimal(25,2) null,
    "minimum" bigint null,
    "maximum" bigint null,
    primary key ("id")
);

create sequence "openSAPNew_MenuSet_1_0_id_seq" start with 1 increment by 1;

create table "openSAPNew_MenuSet_1_0"
(
    "BookingID" bigint not null,
    "CanteenID" bigint not null,
    "Dessert" varchar(400) null,
    "MainDish" varchar(400) not null,
    "MenuID" serial not null,
    "Price" decimal(10,2) null,
    "Sides" varchar(400) null,
    "Soup" varchar(400) null,
    "dateOfLunch" timestamp with time zone not null,
    "kcalForMain" integer null,
    "veggie" boolean null,
    "row_version" bigint not null,
    "is_deleted" boolean not null,
    "last_modified" timestamp with time zone not null,
    primary key ("MenuID")
);

create index "openSAPNew_MenuSet_1_0_last_modified_index" on "openSAPNew_MenuSet_1_0" ("last_modified");

create table "openSAPNew_xs_request_history_1_0"
(
    "CreationTime" timestamp with time zone not null,
    "ResponseStatus" smallint not null,
    "ClientID" bytea not null,
    "RequestID" bytea not null,
    "ResponseHeaders" varchar(4000) not null,
    "ResponseData1" bytea null,
    "ResponseData2" bytea null,
    primary key ("ClientID", "RequestID")
);

create index "openSAPNew_xs_request_history_1_0_creation_time_index" on "openSAPNew_xs_request_history_1_0" ("CreationTime");

create sequence "openSAPNew_CanteenSet_1_0_id_seq" start with 1 increment by 1;

create table "openSAPNew_CanteenSet_1_0"
(
    "CanteenID" serial not null,
    "Location" varchar(400) not null,
    "Name" varchar(400) not null,
    "row_version" bigint not null,
    "is_deleted" boolean not null,
    "last_modified" timestamp with time zone not null,
    primary key ("CanteenID")
);

create index "openSAPNew_CanteenSet_1_0_last_modified_index" on "openSAPNew_CanteenSet_1_0" ("last_modified");
