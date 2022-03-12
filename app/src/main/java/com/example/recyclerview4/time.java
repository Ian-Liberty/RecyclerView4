package com.example.recyclerview4;

public class time {

    int 준비;
    int 운동;
    int 휴식;
    int 라운드;

    public int get준비() {
        return 준비;
    }

    public void set준비(int 준비) {
        this.준비 = 준비;
    }

    public int get운동() {
        return 운동;
    }

    public void set운동(int 운동) {
        this.운동 = 운동;
    }

    public int get휴식() {
        return 휴식;
    }

    public void set휴식(int 휴식) {
        this.휴식 = 휴식;
    }

    public int get라운드() {
        return 라운드;
    }

    public void set라운드(int 라운드) {
        this.라운드 = 라운드;
    }

    public time(int 준비, int 운동, int 휴식, int 라운드) {
        this.준비 = 준비;
        this.운동 = 운동;
        this.휴식 = 휴식;
        this.라운드 = 라운드;
    }
}
