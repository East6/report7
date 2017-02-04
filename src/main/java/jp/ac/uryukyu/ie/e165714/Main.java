package jp.ac.uryukyu.ie.e165714;

/**
 * Created by yonaminehigashi on 2017/02/04.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args){
        //フレーム変数の定義
        JFrame frame;

        //パネル変数定義
        JPanel panel_A;
        JPanel panel_K;
        JPanel panel_S;
        JPanel panel_T;
        JPanel panel_H;
        JPanel panel_M;
        JPanel panel_Y;
        JPanel panel_R;
        JPanel panel_W;
        JPanel panel_N;

        //ボタンまとめる用のパネルの変数を定義#
        JPanel botton_matomeru;

        //frameにaddするようのJPanelの変数を定義#
        JPanel panel_ookii;

        //ボタン変数定義
        JButton btn_a;
        JButton btn_i;
        JButton btn_u;
        JButton btn_e;
        JButton btn_o;

        JButton btn_ka;
        JButton btn_ki;
        JButton btn_ku;
        JButton btn_ke;
        JButton btn_ko;

        JButton btn_sa;
        JButton btn_si;
        JButton btn_su;
        JButton btn_se;
        JButton btn_so;

        JButton btn_ta;
        JButton btn_ti;
        JButton btn_tu;
        JButton btn_te;
        JButton btn_to;

        JButton btn_ha;
        JButton btn_hi;
        JButton btn_hu;
        JButton btn_he;
        JButton btn_ho;

        JButton btn_ma;
        JButton btn_mi;
        JButton btn_mu;
        JButton btn_me;
        JButton btn_mo;

        JButton btn_ya;
        JButton btn_yi;
        JButton btn_yu;
        JButton btn_ye;
        JButton btn_yo;

        JButton btn_ra;
        JButton btn_ri;
        JButton btn_ru;
        JButton btn_re;
        JButton btn_ro;

        JButton btn_wa;
        JButton btn_wi;
        JButton btn_wu;
        JButton btn_we;
        JButton btn_wo;

        JButton btn_nn;
        JButton btn_n1;
        JButton btn_n2;
        JButton btn_n3;
        JButton btn_n4;

        //JTextフィールド変数を定義#
        JTextField text;



        //フレームのオブジェクト作成
        frame = new JFrame("作るだけ");

        //パネルのオブジェクト作成
        panel_A = new JPanel();
        panel_K = new JPanel();
        panel_S = new JPanel();
        panel_T = new JPanel();
        panel_H = new JPanel();
        panel_M = new JPanel();
        panel_Y = new JPanel();
        panel_R = new JPanel();
        panel_W = new JPanel();
        panel_N = new JPanel();


        //ボタンのオブジェクト作成
        btn_a = new JButton("あ");
        btn_i = new JButton("い");
        btn_u = new JButton("う");
        btn_e = new JButton("え");
        btn_o = new JButton("お");

        btn_ka = new JButton("か");
        btn_ki = new JButton("き");
        btn_ku = new JButton("く");
        btn_ke = new JButton("け");
        btn_ko = new JButton("こ");

        btn_sa = new JButton("さ");
        btn_si = new JButton("し");
        btn_su = new JButton("す");
        btn_se = new JButton("せ");
        btn_so = new JButton("そ");

        btn_ta = new JButton("た");
        btn_ti = new JButton("ち");
        btn_tu = new JButton("つ");
        btn_te = new JButton("て");
        btn_to = new JButton("と");

        btn_ha = new JButton("は");
        btn_hi = new JButton("ひ");
        btn_hu = new JButton("ふ");
        btn_he = new JButton("へ");
        btn_ho = new JButton("ほ");

        btn_ma = new JButton("ま");
        btn_mi = new JButton("み");
        btn_mu = new JButton("む");
        btn_me = new JButton("め");
        btn_mo = new JButton("も");

        btn_ya = new JButton("や");
        btn_yi = new JButton("");
        btn_yu = new JButton("ゆ");
        btn_ye = new JButton("");
        btn_yo = new JButton("よ");

        btn_ra = new JButton("ら");
        btn_ri = new JButton("り");
        btn_ru = new JButton("る");
        btn_re = new JButton("れ");
        btn_ro = new JButton("ろ");

        btn_wa = new JButton("わ");
        btn_wi = new JButton("");
        btn_wu = new JButton("");
        btn_we = new JButton("");
        btn_wo = new JButton("を");

        btn_nn = new JButton("ん");
        btn_n1 = new JButton("");
        btn_n2 = new JButton("");
        btn_n3 = new JButton("");
        btn_n4 = new JButton("");

        //テキストフィールドのオブジェクトを生成#
        text = new JTextField("テキストフィールドです。",0);

        //botton_matomeruパネルのオブジェクトを作成#
        botton_matomeru = new JPanel();

        //panel_ookiiパネルのオブジェクトを作成#
        panel_ookii = new JPanel();

        //ボタンまとめる用のJPanelを5行一列のグリッドレイアウトにする。
        botton_matomeru.setLayout(new GridLayout(1,11));

        //パネルのレイアウトを5行1列のグリッドレイアウトにする
        panel_A.setLayout(new GridLayout(5,1));
        panel_K.setLayout(new GridLayout(5,1));
        panel_S.setLayout(new GridLayout(5,1));
        panel_T.setLayout(new GridLayout(5,1));
        panel_H.setLayout(new GridLayout(5,1));
        panel_M.setLayout(new GridLayout(5,1));
        panel_Y.setLayout(new GridLayout(5,1));
        panel_R.setLayout(new GridLayout(5,1));
        panel_W.setLayout(new GridLayout(5,1));
        panel_N.setLayout(new GridLayout(5,1));

        //panel_ookiiのレイアウトをボーターレイアウトにする
        panel_ookii.setLayout(new BorderLayout());

        //パネルにボタンをセット
        panel_A.add(btn_a);
        panel_A.add(btn_i);
        panel_A.add(btn_u);
        panel_A.add(btn_e);
        panel_A.add(btn_o);

        panel_K.add(btn_ka);
        panel_K.add(btn_ki);
        panel_K.add(btn_ku);
        panel_K.add(btn_ke);
        panel_K.add(btn_ko);

        panel_S.add(btn_sa);
        panel_S.add(btn_si);
        panel_S.add(btn_su);
        panel_S.add(btn_se);
        panel_S.add(btn_so);

        panel_T.add(btn_ta);
        panel_T.add(btn_ti);
        panel_T.add(btn_tu);
        panel_T.add(btn_te);
        panel_T.add(btn_to);

        panel_H.add(btn_ha);
        panel_H.add(btn_hi);
        panel_H.add(btn_hu);
        panel_H.add(btn_he);
        panel_H.add(btn_ho);

        panel_M.add(btn_ma);
        panel_M.add(btn_mi);
        panel_M.add(btn_mu);
        panel_M.add(btn_me);
        panel_M.add(btn_mo);

        panel_Y.add(btn_ya);
        panel_Y.add(btn_yi);
        panel_Y.add(btn_yu);
        panel_Y.add(btn_ye);
        panel_Y.add(btn_yo);

        panel_R.add(btn_ra);
        panel_R.add(btn_ri);
        panel_R.add(btn_ru);
        panel_R.add(btn_re);
        panel_R.add(btn_ro);

        panel_W.add(btn_wa);
        panel_W.add(btn_wi);
        panel_W.add(btn_wu);
        panel_W.add(btn_we);
        panel_W.add(btn_wo);

        panel_N.add(btn_nn);
        panel_N.add(btn_n1);
        panel_N.add(btn_n2);
        panel_N.add(btn_n3);
        panel_N.add(btn_n4);

        //パネルをボタンまとめるようパネルにセット
        botton_matomeru.add(panel_N);
        botton_matomeru.add(panel_W);
        botton_matomeru.add(panel_R);
        botton_matomeru.add(panel_Y);
        botton_matomeru.add(panel_M);
        botton_matomeru.add(panel_H);
        botton_matomeru.add(panel_T);
        botton_matomeru.add(panel_S);
        botton_matomeru.add(panel_K);
        botton_matomeru.add(panel_A);

        //ボタンまとめるようパネルをpanel_ookiiのCENTERにセット
        panel_ookii.add(botton_matomeru);

        //panel_ookiiのSOUNTHにテキストフィールドをセット
        panel_ookii.add(text,BorderLayout.SOUTH);

        //フレームにpanel_ookiiをセット
        frame.add(panel_ookii);

        frame.setSize(250,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}