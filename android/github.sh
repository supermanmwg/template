#!/usr/bin/expect  
spawn git push -u  origin master  
expect "Username for 'https://github.com': "  
send "554607289@qq.com\r"
expect "Password for 'https://554607289@qq.com@github.com': "
send "mwg387297\r"  
expect eof  
exit 
