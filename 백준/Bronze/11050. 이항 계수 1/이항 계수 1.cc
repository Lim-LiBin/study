#include <bits/stdc++.h>
#define fastIO cin.tie(0)->sync_with_stdio(0)
using namespace std;

int factorial(int n) {
    long long result = 1;
    
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    
    return result;
}
  
int main() {
    fastIO;
    
    int a, b;
    
    cin >> a >> b;
    
    long long result = factorial(a) / (factorial(b) *  factorial(a - b));
    
    cout << result;
    
    return 0;
}