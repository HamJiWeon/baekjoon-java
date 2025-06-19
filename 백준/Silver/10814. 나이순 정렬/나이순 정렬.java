import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Member[] members = new Member[N];
        
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members[i] = new Member(i, age, name);
        }
        
        Arrays.sort(members);
        
        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }
}

class Member implements Comparable<Member> {
    int id;
    int age;
    String name;
    
    public Member(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    
    public int compareTo(Member member) {
        if (this.age != member.age) return this.age - member.age;
        else return this.id - member.id;
    }
}