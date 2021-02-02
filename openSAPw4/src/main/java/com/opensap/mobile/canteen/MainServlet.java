package com.opensap.mobile.canteen;

@javax.servlet.annotation.WebServlet(
    loadOnStartup = 0,
    urlPatterns = "/*")
public class MainServlet extends com.opensap.mobile.canteen.base.MainServletBase {
    private static final long serialVersionUID = 1L;

    private static volatile MainServlet singleton = null;

    public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
        // For customization, see also: LogSettings, ProviderSettings, TestSettings.
        super.init(config);
        singleton = this;
    }

    public static MainServlet getInstance() {
        // Note: if calling this from another servlet, ensure the other servlet's loadOnStartup is > 0.
        return singleton;
    }
}
