jextract `
  --output src `
  -t libc `
  --header-class-name LibC `
  'libc.h'

javac -d classes (ls -r src/*.java)

