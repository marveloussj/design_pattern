package xyz.marsj.design.pattern.creational.abstractmethod;

/**
 * @Description:
 * @Author: sj
 * @Create: 2019-01-28 10:45
 **/
public class JavaVideo extends Video {
    @Override
    protected void produce() {
        System.out.println("produce javaVideo");
    }
}
