package facebookHome;

import baseAPI.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogIn extends CommonAPI {

    @FindBy(xpath = "//*[@id='email']")
    WebElement Email;

    @FindBy(id = "pass")
    WebElement PassWord;

    @FindBy(name = "q")
    WebElement SearchName;

    @FindBy(linkText = "People")
    WebElement Friend;

    /* send a friend request
    @FindBy(xpath = "//*[@id='u_ps_fetchstream_9_3_f']")
    WebElement AddFriend;
     */

    @FindBy(linkText = "Posts")
    WebElement Post;

    @FindBy(css = "#js_np > a")
    WebElement ViewComment;

    @FindBy(linkText = "Like")
    WebElement LikeAPost;

    @FindBy(xpath = "//*[@id='u_2w_8']/div/div[3]/div[4]/div[2]/div/div[1]/div/div/div/form/div/div/div[2]/div/div/div/div")
    WebElement LeaveComment1;


    public void FacebookLogIn() throws InterruptedException {

        Email.sendKeys("yilisww5@gmail.com");
        sleepFor(1);
        PassWord.sendKeys("123456Go", Keys.ENTER);
        sleepFor(2);

        // search and addfridend
        SearchName.sendKeys("Lebron James 23", Keys.ENTER);
        sleepFor(2);
        Friend.click();
        sleepFor(1);
        //     AddFriend.click();
        sleepFor(2);

        //Comment
        Post.click();
        sleepFor(1);
        ViewComment.click();
        sleepFor(1);
        LikeAPost.click();
        sleepFor(1);
        LeaveComment1.sendKeys("Wonderful!", Keys.ENTER);
        sleepFor(1);
    }
/*
    public void setEmail(){ Email.sendKeys("yilisww5@gmail.com"); }

    public void setPassWord(){ PassWord.sendKeys("123456Go", Keys.ENTER); }

    public void setSearchName(){ UploadImage.sendKeys("Lebron James", Keys.ENTER); }

    public void setFriend(){ Friend.click(); }

//    public void setAddFriend(){ AddFriend.click(); }

    public void setPost(){ Post.click(); }

    public void setViewComment(){ ViewComment.click(); }
 */

}
