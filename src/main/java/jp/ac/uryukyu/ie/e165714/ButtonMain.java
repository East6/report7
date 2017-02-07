package jp.ac.uryukyu.ie.e165714;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonMain {
    public void ButtonSyori() {
        //フレームのオブジェクト作成
        JFrame frame = new JFrame("文字入力アプリ");
        //パネルのオブジェクト作成
        JPanel panels[] = new JPanel[10];//JPanelのオブジェクトを生成するための領域を確保
        for (int i = 0; i < 10; i++) {//panelsの要素にJPanel()オブジェクトを生成
            panels[i] = new JPanel();
        }

        //ボタンのオブジェクト作成
        JButton btn_a = new JButton("あ");
        JButton btn_i = new JButton("い");
        JButton btn_u = new JButton("う");
        JButton btn_e = new JButton("え");
        JButton btn_o = new JButton("お");

        JButton btn_ka = new JButton("か");
        JButton btn_ki = new JButton("き");
        JButton btn_ku = new JButton("く");
        JButton btn_ke = new JButton("け");
        JButton btn_ko = new JButton("こ");

        JButton btn_sa = new JButton("さ");
        JButton btn_si = new JButton("し");
        JButton btn_su = new JButton("す");
        JButton btn_se = new JButton("せ");
        JButton btn_so = new JButton("そ");

        JButton btn_ta = new JButton("た");
        JButton btn_ti = new JButton("ち");
        JButton btn_tu = new JButton("つ");
        JButton btn_te = new JButton("て");
        JButton btn_to = new JButton("と");

        JButton btn_na = new JButton("な");
        JButton btn_ni = new JButton("に");
        JButton btn_nu = new JButton("ぬ");
        JButton btn_ne = new JButton("ね");
        JButton btn_no = new JButton("の");

        JButton btn_ha = new JButton("は");
        JButton btn_hi = new JButton("ひ");
        JButton btn_hu = new JButton("ふ");
        JButton btn_he = new JButton("へ");
        JButton btn_ho = new JButton("ほ");

        JButton btn_ma = new JButton("ま");
        JButton btn_mi = new JButton("み");
        JButton btn_mu = new JButton("む");
        JButton btn_me = new JButton("め");
        JButton btn_mo = new JButton("も");

        JButton btn_ya = new JButton("や");
        JButton btn_yi = new JButton("");
        JButton btn_yu = new JButton("ゆ");
        JButton btn_ye = new JButton("");
        JButton btn_yo = new JButton("よ");

        JButton btn_ra = new JButton("ら");
        JButton btn_ri = new JButton("り");
        JButton btn_ru = new JButton("る");
        JButton btn_re = new JButton("れ");
        JButton btn_ro = new JButton("ろ");

        JButton btn_wa = new JButton("わ");
        JButton btn_wi = new JButton("");
        JButton btn_wo = new JButton("を");
        JButton btn_w = new JButton("");
        JButton btn_nn = new JButton("ん");

        //テキストエリアのオブジェクトを生成#
        final JTextArea text = new JTextArea();

        //botton_matomeruパネルのオブジェクトを作成#
        JPanel botton_matomeru = new JPanel();

        //panel_ookiiパネルのオブジェクトを作成#
        JPanel panel_ookii = new JPanel();

        //ボタンまとめる用のJPanelを5行一列のグリッドレイアウトにする。
        botton_matomeru.setLayout(new GridLayout(1, 11));

        //パネルのレイアウトを5行1列のグリッドレイアウトにする
        for (int i = 0; i < 10; i++) {
            panels[i].setLayout(new GridLayout(5, 1));
        }

        //panel_ookiiのレイアウトをボーターレイアウトにする
        panel_ookii.setLayout(new BorderLayout());

        //パネルにボタンをセット
        panels[0].add(btn_a);
        panels[0].add(btn_i);
        panels[0].add(btn_u);
        panels[0].add(btn_e);
        panels[0].add(btn_o);

        panels[1].add(btn_ka);
        panels[1].add(btn_ki);
        panels[1].add(btn_ku);
        panels[1].add(btn_ke);
        panels[1].add(btn_ko);

        panels[2].add(btn_sa);
        panels[2].add(btn_si);
        panels[2].add(btn_su);
        panels[2].add(btn_se);
        panels[2].add(btn_so);

        panels[3].add(btn_ta);
        panels[3].add(btn_ti);
        panels[3].add(btn_tu);
        panels[3].add(btn_te);
        panels[3].add(btn_to);

        panels[4].add(btn_na);
        panels[4].add(btn_ni);
        panels[4].add(btn_nu);
        panels[4].add(btn_ne);
        panels[4].add(btn_no);

        panels[5].add(btn_ha);
        panels[5].add(btn_hi);
        panels[5].add(btn_hu);
        panels[5].add(btn_he);
        panels[5].add(btn_ho);

        panels[6].add(btn_ma);
        panels[6].add(btn_mi);
        panels[6].add(btn_mu);
        panels[6].add(btn_me);
        panels[6].add(btn_mo);

        panels[7].add(btn_ya);
        panels[7].add(btn_yi);
        panels[7].add(btn_yu);
        panels[7].add(btn_ye);
        panels[7].add(btn_yo);

        panels[8].add(btn_ra);
        panels[8].add(btn_ri);
        panels[8].add(btn_ru);
        panels[8].add(btn_re);
        panels[8].add(btn_ro);

        panels[9].add(btn_wa);
        panels[9].add(btn_wi);
        panels[9].add(btn_wo);
        panels[9].add(btn_w);
        panels[9].add(btn_nn);

        //パネルをボタンまとめるようパネルにセット
        botton_matomeru.add(panels[4]);
        botton_matomeru.add(panels[9]);
        botton_matomeru.add(panels[8]);
        botton_matomeru.add(panels[7]);
        botton_matomeru.add(panels[6]);
        botton_matomeru.add(panels[5]);
        botton_matomeru.add(panels[4]);
        botton_matomeru.add(panels[3]);
        botton_matomeru.add(panels[2]);
        botton_matomeru.add(panels[1]);
        botton_matomeru.add(panels[0]);

        //ボタンまとめるようパネルをpanel_ookiiのCENTERにセット
        panel_ookii.add(botton_matomeru);

        //ボタン処理を追加(46個)
        btn_a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("あ");
            }
        });
        btn_i.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("い");
            }
        });
        btn_u.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("う");
            }
        });
        btn_e.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("え");
            }
        });
        btn_o.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("お");
            }
        });
        btn_ka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("か");
            }
        });
        btn_ki.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("き");
            }
        });
        btn_ku.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("く");
            }
        });
        btn_ke.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("け");
            }
        });
        btn_ko.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("こ");
            }
        });
        btn_sa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("さ");
            }
        });
        btn_si.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("し");
            }
        });
        btn_su.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("す");
            }
        });
        btn_se.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("せ");
            }
        });
        btn_so.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("そ");
            }
        });

        btn_ta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("た");
            }
        });
        btn_ti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ち");
            }
        });
        btn_tu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("つ");
            }
        });
        btn_te.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("て");
            }
        });
        btn_to.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("と");
            }
        });
        btn_na.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("な");
            }
        });
        btn_ni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("に");
            }
        });
        btn_nu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ぬ");
            }
        });
        btn_ne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ね");
            }
        });
        btn_no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("の");
            }
        });
        btn_ha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("は");
            }
        });
        btn_hi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ひ");
            }
        });
        btn_hu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ふ");
            }
        });
        btn_he.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("へ");
            }
        });
        btn_ho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ほ");
            }
        });
        btn_ma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ま");
            }
        });
        btn_mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("み");
            }
        });
        btn_mu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("む");
            }
        });
        btn_me.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("め");
            }
        });
        btn_mo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("も");
            }
        });
        btn_ya.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("や");
            }
        });
        btn_yu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ゆ");
            }
        });
        btn_yo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("よ");
            }
        });
        btn_ra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ら");
            }
        });
        btn_ri.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("り");
            }
        });
        btn_ru.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("る");
            }
        });
        btn_re.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("れ");
            }
        });
        btn_ro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ろ");
            }
        });
        btn_wa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("わ");
            }
        });
        btn_wo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                text.append("を");
            }
        });
        btn_nn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                text.append("ん");
            }
        });

        //panel_ookiiのSOUNTHにテキストフィールドをセット
        panel_ookii.add(text, BorderLayout.SOUTH);

        //フレームにpanel_ookiiをセット
        frame.add(panel_ookii);

        frame.setSize(450, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}