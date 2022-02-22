package FactoryMethod.factory;

import FactoryMethod.model.Blog;
import FactoryMethod.model.Shop;
import FactoryMethod.model.Website;
import FactoryMethod.model.WebsiteType;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType websiteType) {
        switch (websiteType) {
            case BLOG:
                return new Blog();

            case SHOP:
                return new Shop();

            default:
                return null;
        }
    }
}
