package test.account;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BBSItem {
    static int seqNoInfo = 0;
    int seqNo; //일련번호 필드
    String writer; //작성자 필드
    String writtenDate; //작성일자 필드
    String title; //제목필드
    String content; //내용필드
    BBSItem(String writer, String writtenDate, String title, String content){//생성자
        seqNoInfo++;
        this.seqNo=seqNoInfo;
        this.writer=writer;
        this.writtenDate=writtenDate;
        this.title=title;
        this.content=content;

    }

    public static void main(String[] args) {
        BBSItem bbsItem1 = new BBSItem("김용민", "20210510", "JavaProject", "Java");
        BBSItem bbsItem2 = new BBSItem("김용민", "20210510", "JavaProject", "Java");
        BBSItem bbsItem3 = new BBSItem("김용민", "20210510", "JavaProject", "Java");
        System.out.println(bbsItem1.seqNo);
        System.out.println(bbsItem2.seqNo);
        System.out.println(bbsItem3.seqNo);
        System.out.println(bbsItem1.seqNo);
        System.out.println();
    }
}
