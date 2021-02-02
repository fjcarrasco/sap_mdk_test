For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file CanteenSet.json:

''' JSON
[
    {
        "CanteenID": "101",
        "Location": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MenuID": "1234567890123"
    },
    {
        "CanteenID": "102",
        "Location": "XYZ",
        "MenuID": "9876543210987"
    }
]
'''

Sample initial data for file MenuSet.json:

''' JSON
[
    {
        "BookingID": "1234567890123",
        "CanteenID": "1234567890123",
        "Dessert": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MainDish": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MenuID": "201",
        "Price": "12345678.12",
        "Sides": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Soup": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "dateOfLunch": "2021-01-29T11:02:02.256Z",
        "kcalForMain": 123,
        "veggie": false
    },
    {
        "BookingID": "9876543210987",
        "CanteenID": "9876543210987",
        "Dessert": null,
        "MainDish": "XYZ",
        "MenuID": "202",
        "Price": "98765432.98",
        "Sides": null,
        "Soup": null,
        "dateOfLunch": "2021-01-29T11:02:02.256Z",
        "kcalForMain": null,
        "veggie": null
    }
]
'''
