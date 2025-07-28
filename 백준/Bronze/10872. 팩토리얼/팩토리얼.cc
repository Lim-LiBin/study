#include <bits/stdc++.h>
#define fastIO cin.tie(0)->sync_with_stdio(0)
using namespace std;

int n, res;

int recur(int n) {
    if (n < 1) return 1;
    else return n * recur(n-1);
}

int main() {
    fastIO;
    
    cin >> n;
    
    cout << recur(n);  
}