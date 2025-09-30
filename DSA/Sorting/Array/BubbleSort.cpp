#include <iostream>

#define getlen(arr) sizeof(arr)/sizeof(arr[0])

namespace Sort{
    class Bubble{
        public:
            static void sort(int* arr,int len){
                bool sortflag = true;
                int temp = 0;
                for (int i = 0; i < len-1; i++)
                {
                    if (!sortflag){
                        break;
                    }
                    else{
                        sortflag = false;
                        for (int j = 0; j < len-1; j++)
                        {
                            if(arr[j]>arr[j+1]){
                                temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                                sortflag = true;
                            }
                            else{
                                continue;
                            }
                        }
                        
                    }
                }
                
            }
    };

};


int main(){
    int Bubble[] = {3,1,4,9,2,0,6};
    Sort::Bubble::sort(Bubble,getlen(Bubble));
    for (int i = 0; i < getlen(Bubble); i++)
    {
        std::cout << Bubble[i] << std::endl;
    }
    
}