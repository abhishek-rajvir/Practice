#include <iostream>

using namespace std;

int** createMatrix(const int& row,const int& col){
    int** tempmtx = new int*[row];
    for (int i = 0; i < row; i++)
    {
        tempmtx[i] = new int[col]();
    }
    return tempmtx;
    
}

void add_elem(int** mtx,const int row,const int& col){
    for (int i = 0; i < row; i++)
    {
        cout << "\nRow " << i+1 << endl;
        for (int j = 0; j < col; j++)
        {
            cout << "Enter element " << i+1 << ": ";
            cin >> mtx[i][j];
        }
        
    }
}

void disp_mtx(int** mtx,const int& row,const int& col){
    cout << endl;
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            cout << mtx[i][j] << " ";
        }
        cout << endl;
        
    }
}

int main(){
    int row;
    int col;

    cout << "Enter no. of rows and col: ";
    cin >> row >> col;

    int** matrix = createMatrix(row,col);
    
    disp_mtx(matrix,row,col);
    
    add_elem(matrix,row,col);
    
    disp_mtx(matrix,row,col);

}