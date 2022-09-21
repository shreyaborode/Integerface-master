public class Main implements MyInterface{

    public static void main(String[] args) {
        Main a = new Main();
        Button btn = new Button();
        btn.click(a);
    }

    @Override
    public void onClickListener(int a) {
        System.out.println("some forGround work");
        System.out.println(a);
        
    }

}