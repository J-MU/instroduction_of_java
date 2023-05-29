package designPattern.ISP;

public class Man implements BoyFriend, Army, Employee,Son{

    // 남자친구 역할.
    public void celebrateAnniversary() { // 기념일 챙기기
        System.out.println("celebrate Anniversary");
    }

    public void kiss(){
        System.out.println("kiss");
    }

    // 아들 역할
    public void filialPiety(){// 효도하기
        System.out.println("fillial piety");
    }

    public void massage(){
        System.out.println("give massage");
    }

    // 회사원 역할
    public void goToWork(){
        System.out.println("go to work");
    }

    public void work(){
        System.out.println("work");
    }

    // 소대원 역할
    public void shoot(){
        System.out.println("shoot");
    }

    public void running(){
        System.out.println("run");
    }
}
