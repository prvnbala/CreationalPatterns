package FactoryMethod.model;

public class Blog extends Website{
    @Override
    public void createPages() {
        pages.add(new AboutPage());
        pages.add(new PostPage());
        pages.add(new CommentPage());
    }
}
