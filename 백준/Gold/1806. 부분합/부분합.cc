#include <bits/stdc++.h>
#define fastIO cin.tie(0)->sync_with_stdio(0)
using namespace std;

int n, s, tmp, len = INT_MAX, lt = 0, rt = 0;
int arr[100000];

int main() {
    fastIO;
    
    cin >> n >> s;
    
    for(int i=0; i<n; i++) cin >> arr[i];
    
    
    while(rt < n) {
        tmp += arr[rt++];
        
        if(tmp >= s) {
            len = min(len, rt - lt);
        
            while(tmp >= s) {
                tmp -= arr[lt++];
                
                if(tmp >= s) len = min(len, rt - lt);
            }
        }
    }
    
    cout << (len == INT_MAX ? 0 : len) << '\n';
}