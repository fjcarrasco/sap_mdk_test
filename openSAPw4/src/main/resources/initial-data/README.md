For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file BookingSet.json:

''' JSON
[
    {
        "BookingDate": "2021-01-31T05:34:39.921Z",
        "BookingID": "101",
        "MenuID": "301",
        "Price": "12345678.12",
        "Status": "ABCDEFGHIJKLMNOPQRST",
        "User": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "BookingDate": "2021-01-31T05:34:39.922Z",
        "BookingID": "102",
        "MenuID": "302",
        "Price": "98765432.98",
        "Status": "XYZ",
        "User": "XYZ"
    }
]
'''

Sample initial data for file CanteenSet.json:

''' JSON
[
    {
        "CanteenID": "201",
        "Location": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Name": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "CanteenID": "202",
        "Location": "XYZ",
        "Name": "XYZ"
    }
]
'''

Sample initial data for file MenuSet.json:

''' JSON
[
    {
        "BookingID": "1234567890123",
        "CanteenID": "201",
        "Dessert": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MainDish": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MenuID": "301",
        "Price": "12345678.12",
        "Sides": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Soup": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "dateOfLunch": "2021-01-31T05:34:39.931Z",
        "kcalForMain": 123,
        "veggie": false
    },
    {
        "BookingID": "9876543210987",
        "CanteenID": "202",
        "Dessert": null,
        "MainDish": "XYZ",
        "MenuID": "302",
        "Price": null,
        "Sides": null,
        "Soup": null,
        "dateOfLunch": "2021-01-31T05:34:39.932Z",
        "kcalForMain": null,
        "veggie": null
    }
]
'''
