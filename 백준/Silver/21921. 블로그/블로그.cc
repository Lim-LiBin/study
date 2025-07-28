#include <bits/stdc++.h>
#define fastIO cin.tie(0)->sync_with_stdio(0)
using namespace std;

int arr[250001];
int sum[250001];

int main() {
    fastIO;

    int n, x, ans = 0, cnt;
    
    cin >> n >> x;
    
    for (int i = 1; i <= n; i++) {
        cin >> arr[i];
        sum[i] = sum[i-1] + arr[i];
    }
    
    for (int i = x; i <= n; i++) {
        int tmp = sum[i] - sum[i - x];
        
        if(ans == tmp) cnt++;
        
        if(ans < tmp) {
            cnt = 1;
            ans = tmp;
        }
    }
    
    if (ans == 0) cout << "SAD";
    else cout << ans << '\n' << cnt << '\n';
}