import java.net.MalformedURLException;

public class Testing {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        SignIn();
        Pin();
        Collage();
        Board();
        Search();
        LogOut();
    }

    public static void SignIn() throws MalformedURLException, InterruptedException {
        OpenPinterest.openPinterest();
        SignIn.signInGoogleSuccess();
        SignIn.notificationAlert();
        LogOut.logOut();
        SignIn.signInEmailSuccess();
        LogOut.logOut();
        SignIn.signInEmailFail();
        OpenPinterest.getDriver().quit();
    }

    public static void Pin() throws MalformedURLException, InterruptedException {
        OpenPinterest.openPinterest();
        SignIn.signInGoogleSuccess();
        SignIn.notificationAlert();
        Pin.clickPin();
        Pin.likePin();
        Pin.savePin();
        Pin.downloadPin();
        Pin.createPin();
        OpenPinterest.getDriver().quit();
    }

    public static void Collage() throws MalformedURLException, InterruptedException {
        OpenPinterest.openPinterest();
        SignIn.signInGoogleSuccess();
        SignIn.notificationAlert();
        Collage.createCollage();
        Collage.deleteCollage();
        OpenPinterest.getDriver().quit();
    }

    public static void Board() throws MalformedURLException, InterruptedException {
        OpenPinterest.openPinterest();
        SignIn.signInGoogleSuccess();
        SignIn.notificationAlert();
        Board.createBoard();
        Board.deleteBoard();
        OpenPinterest.getDriver().quit();
    }

    public static void Search() throws MalformedURLException, InterruptedException {
        OpenPinterest.openPinterest();
        SignIn.signInGoogleSuccess();
        SignIn.notificationAlert();
        Search.searchWithWords("our beloved summer");
        Search.searchWithManySymbols();
        Search.searchWithPicture();
        OpenPinterest.getDriver().quit();
    }

    public static void LogOut() throws MalformedURLException, InterruptedException {
        OpenPinterest.openPinterest();
        SignIn.signInGoogleSuccess();
        SignIn.notificationAlert();
        LogOut.logOut();
        OpenPinterest.getDriver().quit();
    }
}
