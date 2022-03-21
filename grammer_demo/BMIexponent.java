package grammer_demo;

public class BMIexponent {
    public static void main(String[] args) {
        double height=1.72;
        int weight=70;
        double BMI=weight/(height*height);
        System.out.println("您的身高为："+height);
        System.out.println("您的体重为："+weight);
        System.out.println("您的BMI指数为："+BMI);
        System.out.println("您的体重属于：");
        if (BMI<18.5){
            System.out.println("体重过轻");
        }
        if (BMI>18.5&&BMI<24.9){
            System.out.println("正常范围");
        }
        if(BMI>24.9&&BMI<29.9){
            System.out.println("体重过重");
        }
        if (BMI>=29.9){
            System.out.println("肥胖");
        }

    }
}
