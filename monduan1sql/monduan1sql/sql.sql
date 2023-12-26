create database qlxe
use qlxe

drop database qlxe

create table NhanVien(
MaNV varchar(10) not null,
Hoten nvarchar(50) not null,
MatKhau varchar(15) not null,
GioiTinh bit not null,
NgaySinh date not null,
DiaChi nvarchar(100) not null,
SoDT int not null,
ChucVu bit not null,
Email varchar(30) not null,
SoCCCD int not null
primary key (MaNV)
)


create table KhachHang (
MaKH varchar(10) not null,
HoTen nvarchar(50) not null,
GioiTinh bit not null,
DiaChi nvarchar(100) not null,
SoDT int not null,
MaNV varchar(10) not null,
Email varchar(30) not null,
ThoiGian date not null
primary key(MaKH),
foreign key (MaNV) references NhanVien(MaNV)
)


create table NhaCungCap(
MaNCC varchar(10) not null,
TenNCC nvarchar(30) not null,
DiaChi nvarchar(100) not null,
SoDT int not null,
GhiChu nvarchar(200) null,
MaNV varchar(10) not null,
Email varchar(30) not null,
primary key (MaNCC),
foreign key (MaNV) references NhanVien(MaNV)
)

create table qlxe(
MaXe varchar(10) not null,
MaNCC varchar(10) not null,
TenXe nvarchar(30) not null,
SoLuong int not null,
Gia float not null,
PhanLoai nvarchar(20) not null,
GhiChu nvarchar(200) null,
Hinh nvarchar(100) null
primary key (MaXe),
foreign key (MaNCC) references NhaCungCap(MaNCC)
)

create table HoaDonBanHang(
MaHD varchar(10) not null,
MaKH varchar(10) not null,
MaNV varchar(10) null,
NgayBan date not null,
primary key (MaHD),
foreign key (MaKH) references KhachHang(MaKH),
foreign key (MaNV) references NhanVien(MaNV)
)





create table HoaDonBanHangChiTiet (
MaHDCT int not null,
MaHD varchar(10) not null,
MaXe varchar(10) not null,
SoLuong int not null,
primary key (MaHDCT),
foreign key (MaHD) references  HoaDonBanHang(MaHD),
foreign key (MaXe) references qlxe(MaXe)
)


create table HoaDonNhapXe(
MaHDN varchar(10) not null,
MaNCC varchar(10) not null,
MaXe varchar(10) not null,
MaNV varchar(10) not null,
NgayNhap date not null,
SoLuong int not null,
GhiChu nvarchar(100) null,
Gia float not null,
primary key (MaHDN),
foreign key (MaNCC) references NhaCungCap(MaNCC),
foreign key (MaXe) references qlxe(MaXe),
foreign key (MaNV) references NhanVien(MaNV)
)
create table LichSu(
Stt int identity(1,1),
MaHD varchar(10),
MaKH varchar(10),
MaNV varchar(10),
NgayBan date,
SoLuong int,
TongTien float,
primary key (Stt),
foreign key (MaHD) references HoaDonBanHang(MaHD)
)
drop table LichSu
ALTER TABLE LichSu drop CONSTRAINT FK__LichSu__MaHD__49C3F6B7;
alter table LichSu 
add foreign key (MaHD) references HoaDonBanHang(MaHD);
select * from hoadonbanhang



 insert into NhanVien values ('NV001',N'Đỗ Ngọc Hoàng','12345',0,'2003/02/02',N'Thăng Bình, Quảng Nam','0923456544',0,'hoang223@gmail.com','10256756'),
 ('NV002',N'Nguyễn Văn Hoàng Anh','12345',0,'2003/01/04',N'Thăng Bình, Quảng Nam','0927896544',1,'hoanganh@gmail.com','10956756'),
 ('NV003',N'Lê Hoài Ngọc','12345',0,'2003/01/09',N'Thăng Bình, Quảng Nam','0363456544',1,'ngocnh@gmail.com','10234546'),
 ('NV004',N'Trần Hoài An','12345',0,'2003/05/06',N'Duy Xuyên, Quảng Nam','0971456544',0,'anhtran@gmail.com','10256756'),
 ('NV005',N'Đỗ Hoàng Luân','12345',0,'2003/07/06',N'Thăng Bình, Quảng Nam','0919456544',1,'luan223@gmail.com','16456756'),
 ('NV006',N'Lê Hoàng Quỳnh Hạ','12345',1,'2003/10/10',N'Quế Sơn, Quảng Nam','0987556544',1,'quynhha@gmail.com','10256756'),
 ('NV007',N'Đỗ Ngọc Hương Quỳnh','12345',1,'2003/08/10',N'Thăng Bình, Quảng Nam','0929866544',0,'quynh@gmail.com','11456756')
 --select * from NhanVien
 --delete NhanVien where MaNV like 'NV007'

 insert into KhachHang values 
 ('KH001',N'Lê Văn Hoa',0,N'Thanh Khê, Đà Nẵng','0978654345','NV001','hoa123@gmaul.com','2022-04-11'),
 ('KH002',N'Lê Hoài Nam',0,N'Liêm Chiểu, Đà Nẵng','0986654345','NV001','namnv@gmaul.com','2022-03-17'),
 ('KH003',N'Lê Kiều Oanh',1,N'Thanh Khê, Đà Nẵng','0995654345','NV002','kieuoanh@gmaul.com','2022-03-11'),
 ('KH004',N'Lê Võ Hoài An',1,N'Sơn Trà, Đà Nẵng','0978698645','NV002','hoaian@gmaul.com','2022-03-10'),
 ('KH005',N'Nguyễn Hoài Vũ',0,N'Sơn Trà, Đà Nẵng','0990154345','NV004','vuvu123@gmaul.com','2021-08-11')
 --select * from KhachHang

 --select COUNT(*) as Nam from KhachHang where GioiTinh like 0 group by Year(ThoiGian)
 --1. thống kê khách hàng
 --select YEAR(ThoiGian) as N'Năm', count(MaKH) as N'Số lượng khách hàng'
   --from KhachHang group by YEAR(ThoiGian)

   insert into NhaCungCap values
   ('NCC001','Yamaha',N'Hà Nội','023678432',N'Nhà cung cấp xe','NV001','yamaha12@gmail.com'),
    ('NCC002','Honda',N'Hà Nội','023980432',N'Nhà cung cấp xe','NV001','honda@gmail.com'),
	 ('NCC003',N'TNHH SX Và TM Khang Thịnh','Hà Nội','024382335',N'Nhà cung cấp xe','NV001','khangthinh@gmail.com')
   --select * from NhaCungCap

   insert into qlxe values
   ('MX001','NCC003','SH',100,'69000',N'Xe tay ga',N'Quản lý xe',null),
   ('MX002','NCC002','dream',100,'19000',N'Xe số',N'Quản lý xe',null),
   ('MX003','NCC001','Janus',90,'50000',N'Xe tay ga',N'Quản lý xe',null),
   ('MX004','NCC001','Freego',100,'57000',N'Xe tay ga',N'Quản lý xe',null),
    ('MX005','NCC001','Latte',100,'70000',N'Xe tay ga',null,null),
	('MX006','NCC001','NVX',150,'61000',N'Xe tay ga',null,null),
	('MX007','NCC002','Vision',200,'42000',N'Xe tay ga',null,null)

   --select * from qlxe

   insert into HoaDonNhapXe values 
   ('NX001','NCC001','MX003','NV003','2022/10/16',50,null,'9000000'),
   ('NX002','NCC001','MX005','NV002','2022/09/09',100,null,'10000000'),
   ('NX003','NCC001','MX006','NV003','2022/07/06',80,null,'90000000')
   
     insert into HoaDonNhapXe values 
   ('NX004','NCC001','MX003','NV003','2022/10/16',40,null,'9000000'),
   ('NX005','NCC001','MX003','NV002','2022/09/09',90,null,'10000000')
   --select * from HoaDonNhapXe
   --2. thống kê xe đã nhập
   --select TenXe as N'Tên xe', sum(nx.SoLuong) as N'Số lượng', SUM(Gia*nx.SoLuong) as N'Tổng tiền'
    --from HoaDonNhapXe nx inner join qlxe ql on nx.MaXe=ql.MaXe group by nx.MaXe, ql.TenXe

	insert into HoaDonBanHang values
	('BH001','KH001','NV003','2022/11/04'),
	('BH002','KH004','NV001','2022/11/03'),
	('BH003','KH002','NV002','2022/08/04'),
	('BH004','KH002','NV003','2022/03/04')
	

	insert into HoaDonBanHangChiTiet values 
	(1,'BH001','MX001',2),
	(2,'BH001','MX002',1),
	(3,'BH002','MX001',2),
	(4,'BH002','MX002',3),
	(5,'BH001','MX004',3)
--delete from HoaDonBanHangChiTiet where MaHDCT =5
	
	select hd.MaHD, MaKH,MaNV,NgayBan,sum(ct.SoLuong) SoLuong,
 SUM(qlxe.Gia * ct.SoLuong) TongTien
 from HoaDonBanHang hd inner join HoaDonBanHangChiTiet ct on 
 hd.MaHD=ct.MaHD inner join qlxe on qlxe.MaXe = ct.MaXe
 group by hd.MaHD, MaKH,MaNV,NgayBan 
	
	


go
create proc sp_qlxe (@Nam int)
as begin
select TenXe, 
sum(ct.SoLuong) as SoLuong,
sum(nx.SoLuong) as SoLuongNhap,
sum(nx.SoLuong - ct.SoLuong) as tonkho
from LichSu ls inner join HoaDonBanHangChiTiet ct on ls.MaHD = ct.MaHD 
inner join qlxe ql on ct.MaXe = ql.MaXe inner join
hoadonnhapxe nx on ql.MaXe = nx.MaXe
where Year(ls.NgayBan) = @Nam
group by TenXe
order by SoLuong
end

--drop proc sp_qlxe
go
create proc sp_doanhthu(@Nam int)
as begin
select TenXe,
SUM(ct.SoLuong) SoLuong,
sum(ql.Gia*ct.SoLuong) TongTien
  from LichSu ls inner join HoaDonBanHangChiTiet ct 
on ls.MaHD = ct.MaHD inner join qlxe ql on ql.MaXe = ct.MaXe
where YEAR(ls.NgayBan) = @Nam
group by TenXe
end

go
create proc sp_nhanvienban(@thang int)
as begin
select Hoten HoTen,
nv.MaNV MaNV,
 count(ls.MaNV) SoLanBan, 
 sum(ct.SoLuong) SoLuong,
 sum(Gia * ct.SoLuong) DoanhThu
  from NhanVien nv 
	inner join LichSu ls on nv.MaNV = ls.MaNV inner join HoaDonBanHangChiTiet ct
	 on ct.MaHD = ls.MaHD inner join qlxe ql on ql.MaXe = ct.MaXe
	where Month(ls.NgayBan) = @thang
	group by Hoten,NgayBan,nv.MaNV
	order by DoanhThu desc
end


go
create function sL_HoaDon (@soLuong int)
returns int
as 
begin
declare @soLuong_HD int;
if @soLuong = 0
set @soLuong_HD = 0;
else
set @soLuong_HD = @soLuong_HD
return @soLuong_HD
end;
drop function dbo.sL_HoaDon

go
create proc sp_hoadonban
as begin
select hd.MaHD MaHD,
MaKH  MaKH,
MaNV  MaNV,
NgayBan  NgayBan,
sum((ct.SoLuong)) SoLuong,
 SUM(qlxe.Gia * ct.SoLuong) TongTien
 from HoaDonBanHang hd inner join HoaDonBanHangChiTiet ct on hd.MaHD=ct.MaHD inner join qlxe on qlxe.MaXe = ct.MaXe
 group by hd.MaHD, MaKH,MaNV,NgayBan
end

select TenXe, COUNT(MaKH) as N'Số lượng khách hàng', 
sum(ct.SoLuong) as soXE,
sum(Gia * ct.SoLuong) as N'Doanh thu bán được' 
from HoaDonBanHang bh inner join qlxe ql on bh.MaXe = ql.MaXe inner join HoaDonBanHangChiTiet ct on bh.MaHD = ct.MaHD
group by TenXe
--where YEAR(bh.NgayBan)
drop proc sp_hoadonban

--HÓA ĐƠN CHI TIẾT
go
create proc sp_hoadonchitiet
as begin
select ct.MaHDCT as MaHDCT,
ct.MaHD as MaHD,
ct.MaXe as MaXe,
ct.SoLuong as SoLuong,
 qlxe.Gia as Gia,
(ct.SoLuong*qlxe.Gia) as Tong
from HoaDonBanHangChiTiet ct inner join qlxe on qlxe.MaXe = ct.MaXe
end

go
create proc sp_hoadonchitiet1(@ma varchar)
as begin
select ct.MaHDCT as MaHDCT,
ct.MaHD as MaHD,
ct.MaXe as MaXe,
ct.SoLuong as SoLuong,
 qlxe.Gia as Gia,
(ct.SoLuong*qlxe.Gia) as Tong
from HoaDonBanHangChiTiet ct inner join qlxe on qlxe.MaXe = ct.MaXe
where ct.MaHD =@ma
end

go
create proc sp_lichsu
as begin 
INSERT INTO LichSuHoaDonBanHangChiTiet
SELECT *
FROM HoaDonBanHangChiTiet;
end



select * from NhanVien