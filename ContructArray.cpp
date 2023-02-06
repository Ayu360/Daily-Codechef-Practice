#include <iostream>
using namespace std;
typedef long long ll;


int main() {
	int t;
	cin>>t;
	while(t--){
        ll n;
        cin>>n;
        if(n&1){
            cout<<"-1"<<endl;
            continue;
        }
        n=(n-1)/2;
        for(ll i=0; i<n; i++){
            cout<<"2 -2 ";
        }
        cout<<"2 1"<<endl; 
	}
	return 0;
}
