#include <bits/stdc++.h>
#define fastIO cin.tie(0)->sync_with_stdio(0)
using namespace std;

int main() {
    fastIO;
    
    int n, m;
    int cards[100], result = 0, total;
    
    cin >> n >>m;
    
    for (int i = 0; i < n; i++) {
        cin >> cards[i];
    }
    
    for (int i = 0; i < n-2; i++) {
        for (int j = i+1; j < n-1; j++) {
            for (int k = j+1; k < n; k++) {
                total = cards[i] + cards[j] + cards[k];
                
                if (result < total && total <= m) {
                    result = total;
                }
            }
        }
    }
    
    cout << result;
    
    return 0;
}