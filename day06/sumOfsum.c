#include<stdio.h>

int sum();

int main(){
    int n,i;
    int arr[n];
    scanf("%d",&n);
    for(i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
    printf("%d",sum(n-1,arr));
    return 0;
}

int sum(int i, int arr[]){
    if(i == 0){
        return arr[0];
    }
    return arr[i] + sum(i-1,arr);
}