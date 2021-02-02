{
	"_Name": "BlogMDKDemoApp",
	"Version": "/BlogMDKDemoApp/Globals/AppDefinition_Version.global",
	"MainPage": "/BlogMDKDemoApp/Pages/Main.page",
	"OnLaunch": [
		"/BlogMDKDemoApp/Actions/Service/InitializeOffline.action"
	],
	"OnWillUpdate": "/BlogMDKDemoApp/Rules/OnWillUpdate.js",
	"OnDidUpdate": "/BlogMDKDemoApp/Actions/Service/InitializeOffline.action",
	"Styles": "/BlogMDKDemoApp/Styles/Styles.less",
	"Localization": "/BlogMDKDemoApp/i18n/i18n.properties"
}
