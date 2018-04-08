import java.lang.reflect.Field;

/**
 * @author xy
 * @date 2018/04/08 21:50
 *
 * 自定义注解
 */
public class Annotation_main {
    public static void main(String[] args) {
        getFruitMsg("Apple");
    }

    private static void getFruitMsg(String clas){
        try{
            Class clazz = Class.forName(clas);
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if(field.isAnnotationPresent(Fruit.class)){
                    Fruit fruit = field.getAnnotation(Fruit.class);
                    System.out.println(fruit.age()+","+fruit.color()+","+fruit.size());
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
