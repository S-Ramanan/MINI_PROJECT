#include <stdio.h>
#define N 9
void printGrid(int grid[N][N]) {
    for (int row = 0; row < N; row++) {
        for (int col = 0; col < N; col++) {
            printf("%d ", grid[row][col]);
        }
        printf("\n");
    }
}

int inrow(int grid[N][N],int row,int num){
    for(int col=0;col<N;col++){
        if(grid[row][col]==num){
            return 1;
        }
    }
    return 0;
}

int incol(int grid[N][N],int col,int num){
    for(int row=0;row<N;row++){
        if(grid[row][col]==num){
            return 1;
        }
    }
    return 0;
}

int inbox(int grid[N][N],int srow,int scol,int num){
    for(int row=0;row<3;row++){
        for(int col=0;col<3;col++){
            if(grid[row+srow][col+scol] == num){
                return 1;
            }
        }
    }
    return 0;
}

int issafe(int grid[N][N], int row,int col, int num){
    return (!inrow(grid,row,num) && !incol(grid,col,num) && !inbox(grid,row-row%3,col-col%3,num));
}

int findemptycell(int grid[N][N], int *row, int *col){
        for(*row=0;*row<N;(*row)++){
            for(*col=0;*col<N;(*col)++){
                if(grid[*row][*col]==0){
                    return 1;
                }
            }
        }
        return 0;
}

int solver(int grid[N][N]){
    int row,col;
    if(!findemptycell(grid,&row,&col)){
        return 1;
    }

    for(int num=0;num<=9;num++){
        if(issafe(grid,row,col,num)){
            grid[row][col]=num;

            if(solver(grid)){
                return 1;
            }

            grid[row][col]=0;
        }
    }
    return 0;
}
int main(){
    int grid[N][N];
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            scanf("%d",&grid[i][j]);
        }
    }
    if(solver(grid)){
        printf("SOLUTION\n");
        printGrid(grid);
    }

    else{
        printf("NOT SOLVABALE");
    }
    return 0;
}
