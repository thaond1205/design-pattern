Singleton pattern là gì?
- Nó thuộc loại khởi tạo
- Singleton pattern đảm bảo rằng 1 lớp chỉ có 1 instace duy nhất và cung cấp giao diện chung để truy cập vào lớp đó

Đặc điểm Singleton pattern
- hạn  chế việc khởi tạo class
- phải cung cấp một điểm truy cập toàn cục

Cách triển khai Singleton pattern
- tạo private constructor để đảm bảo rằng class khác không thể truy cập vào để tạo instace mới
- tạo biến private static và nó là duy nhất và được tạo trong class đó
- tạo method public và trả về instace trên để các class các có thể truy cập vào 

có 8 loại Singleton pattern
- Eager initialization.
- Static block initialization.
- Lazy Initialization.
- Thread Safe Singleton.
- Bill Pugh Singleton Implementation.
- Using Reflection to destroy Singleton Pattern.
- Enum Singleton.
- Serialization and Singleton.

1. EagerInitialization
- được tạo tại thời điểm loading class
- đây là cách nhanh nhất để tạo Singleton pattern
- nhược điểm cá thể đó được tạo ra mặc dù người dùng không sử dụng nó

2. Static block initialization
- cả EagerInitialization và Static block initialization đều tạo ra đối tượng trước khi sử dụng và không phải cách tốt nhất để sử dụng
- Static block initialization thì sẽ control được exception

3. LazyInitialization
- nó sẽ tạo instace khi thực hiện gọi tới nó!