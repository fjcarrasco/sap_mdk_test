For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file CanteenSet.json:

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

Sample test data for file MenuSet.json:

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
        "dateOfLunch": "2021-01-29T11:02:02.258Z",
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
        "dateOfLunch": "2021-01-29T11:02:02.258Z",
        "kcalForMain": null,
        "veggie": null
    }
]
'''
