## perl
```perl
open( fileHandle, "<hello.pl" );  # hello.pl을 읽기 모드로 엽니다.
open( fileHandle, "hello.pl" );   # hello.pl을 읽기 모드로 엽니다.
open( fileHandle, ">hello.pl" );  # hello.pl을 쓰기 모드로 엽니다.
open( fileHandle, ">>hello.pl" ); # hello.pl의 끝에서부터 추가하여
                                  # 쓰기 모드로 엽니다.
open( fileHandle, "+<hello.pl" ); # 읽기와 쓰기 모드로 엽니다.
```
cited: http://www.perl.or.kr/perl_iyagi/files

```perl
#!/usr/bin/perl -w
```
cmd to run
```bash
$ sudo chmod +x fileName.pl
$ ./fileName.pl

wth does this mean
```perl
END{
    qx{7z x 7zipped};
    print qx{cat dontfuckitup};
}
```

