jextract -t libzstd \
  -I /usr/local/Cellar/zstd/1.5.2/include \
  -l zstd \
  --header-class-name Libzstd \
    /usr/local/Cellar/zstd/1.5.2/include/zstd.h

