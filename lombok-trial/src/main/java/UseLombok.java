
public class UseLombok {
    public static void main(String[] args) {
        LombokPojoVO lombokPojoVO=LombokPojoVO.of("this is a trial");
        lombokPojoVO.setCount(10);

        System.out.println(lombokPojoVO);
        LombokPojoVO.of(null);

    }
}
