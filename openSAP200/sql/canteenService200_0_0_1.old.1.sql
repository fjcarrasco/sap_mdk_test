-- generated by csdl-to-sql for target pgsql from com.opensap.mobile.canteen.csdl.xml

create sequence "canteenService200_xs_data_metrics_0_0_1_id_seq" start with 1 increment by 1;

create table "canteenService200_xs_data_metrics_0_0_1"
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

create table "canteenService200_xs_request_history_0_0_1"
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

create index "canteenService200_xs_request_history_0_0_1_creation_time_index" on "canteenService200_xs_request_history_0_0_1" ("CreationTime");

create sequence "canteenService200_MenuSet_0_0_1_id_seq" start with 1 increment by 1;

create table "canteenService200_MenuSet_0_0_1"
(
    "BookingID" bigint not null,
    "CanteenID" bigint not null,
    "Dessert" varchar(400) null,
    "MainDish" varchar(400) not null,
    "MenuID" serial not null,
    "Price" decimal(10,2) not null,
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

create index "canteenService200_MenuSet_0_0_1_last_modified_index" on "canteenService200_MenuSet_0_0_1" ("last_modified");

create sequence "canteenService200_CanteenSet_0_0_1_id_seq" start with 1 increment by 1;

create table "canteenService200_CanteenSet_0_0_1"
(
    "CanteenID" serial not null,
    "Location" varchar(400) not null,
    "Name" varchar(400) not null,
    "row_version" bigint not null,
    "is_deleted" boolean not null,
    "last_modified" timestamp with time zone not null,
    primary key ("CanteenID")
);

create index "canteenService200_CanteenSet_0_0_1_last_modified_index" on "canteenService200_CanteenSet_0_0_1" ("last_modified");
