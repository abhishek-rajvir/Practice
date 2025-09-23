package com.imp;

interface PrinterFunc{
    void printf(String message);
}

class Printer implements PrinterFunc{
    public static void main(String[] args){
            PrinterFunc pf = new Printer(); // implicit upcast no jvm error
            pf.print(); // will cause an compiler error since its not defined or implemented
    }

}