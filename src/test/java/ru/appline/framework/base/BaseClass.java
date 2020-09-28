package ru.appline.framework.base;

import org.junit.After;
import org.junit.Before;
import ru.appline.framework.managers.InitManager;
import ru.appline.framework.managers.PageManager;
import ru.appline.framework.utils.MyAllureListener;

public class BaseClass {

    protected PageManager app = PageManager.getPageManager();

    @Before
    public void beforeEach() {
        InitManager.initFramework();
    }

    @After
    public void afterEach() {
        MyAllureListener.addScreenshot();
        InitManager.quitFramework();
    }
}

