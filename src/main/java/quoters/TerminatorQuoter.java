package quoters;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {
    public TerminatorQuoter() {
        System.out.println("constructor");
        System.out.println("repeat = " + repeat + "\n");
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
        System.out.println("repeat = " + repeat + "\n");

    }

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostConstruct
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
