package test_help;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 *  [1] 버튼 그룹에 체크박스 3개 만들어 선택하면 해당 이미지가 출력되는 프로그램
 *      예) 사과(checkbox) / 배(checkbox) / 체리(checkbox)
 *      (+) 버튼을 그룹으로 묶으면, 2가지 이상 체크가 불가능하다.
 */

public class FirstProgram extends JFrame {
    // 이미지 3개 저장할 객체 생성

    // 해당 이미지는 예시이므로, workspace 폴더에 이미지를 삽입 해주어야 한다.
    ImageIcon img1 = new ImageIcon("a.jpg");
    ImageIcon img2 = new ImageIcon("b.jpg");
    ImageIcon img3 = new ImageIcon("c.jpg");
    JLabel lbl = new JLabel();
    JPanel p;

    FirstProgram() {
        this.setTitle("체크박스 예제");
        this.setSize(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel(); p.setLayout(new FlowLayout());

        JCheckBox cb1 = new JCheckBox("코알라");
        JCheckBox cb2 = new JCheckBox("수국");
        JCheckBox cb3 = new JCheckBox("튤립");

        ButtonGroup bg = new ButtonGroup(); // 체크박스 여러개 중 하나만 선택되도록 설정
        bg.add(cb1); bg.add(cb2); bg.add(cb3);

        cb1.addItemListener(new ItemListener()
                            {

                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if(e.getStateChange() == ItemEvent.SELECTED)
                                        lbl.setIcon(img1);

                                }
                            }
        );
        cb2.addItemListener(new ItemListener()
                            {

                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if(e.getStateChange() == ItemEvent.SELECTED)
                                        lbl.setIcon(img2);

                                }
                            }
        );
        cb3.addItemListener(new ItemListener()
                            {

                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if(e.getStateChange() == ItemEvent.SELECTED)
                                        lbl.setIcon(img3);

                                }
                            }
        );

        p.add(cb1); p.add(cb2); p.add(cb3);
        p.add(lbl);
        this.setContentPane(p); // 컨텐츠를 프레임에 부착
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FirstProgram();

    }

} 


