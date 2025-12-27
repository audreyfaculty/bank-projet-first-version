#include <stdio.h>
int main(){
    int number;
    number=takeNum();
    printf("the number is %d",number);
    
    return 0;
}
    int takeNum(){
        int n;
        printf("enter a number\n");
        scanf("%d",&n);
        return n;
    }
