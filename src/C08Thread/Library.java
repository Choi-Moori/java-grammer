package C08Thread;

public class Library {
    static int bookCount = 100;
//    public static void borrow(){
//    synchronized 키워드를 통해서 해당 메서드에 한해서 lock걸도록 설정
    
    public static void borrow(){
        if(bookCount>0){
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            bookCount--;
            System.out.println("대출완료");
            System.out.println("남아있는 책수량 " + bookCount);
        }
        else {
            System.out.println("대출불가");
        }
    }
}
