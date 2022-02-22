package FactoryMethod;

import FactoryMethod.factory.WebsiteFactory;
import FactoryMethod.model.Website;
import FactoryMethod.model.WebsiteType;
import jdk.swing.interop.SwingInterOpUtils;

public class Application {
    public static void main(String[] args) {
        Website amazon = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        Website wordpress = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(amazon.getPages());
        System.out.println(wordpress.getPages());
    }



}
