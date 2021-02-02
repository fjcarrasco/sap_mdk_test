{
	"_Name": "ChefsDelight",
	"Version": "/ChefsDelight/Globals/AppDefinition_Version.global",
	"MainPage": "/ChefsDelight/Pages/Main.page",
	"OnLaunch": [
		"/ChefsDelight/Actions/Service/InitializeOffline.action"
	],
	"OnWillUpdate": "/ChefsDelight/Rules/OnWillUpdate.js",
	"OnDidUpdate": "/ChefsDelight/Actions/Service/InitializeOffline.action",
	"Styles": "/ChefsDelight/Styles/Styles.less",
	"Localization": "/ChefsDelight/i18n/i18n.properties"
}
