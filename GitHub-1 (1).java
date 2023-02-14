
					cd .. : lùi lại 1 thư mục
					

					gen SSH key :ssh-keygen -t ed25519 -C "kyl.kt95@gmail.com"
					folder : C:\Users\khanh\.ssh
					https://vietnix.vn/git-la-gi/
					
					https://xuanthulab.net/cac-lenh-git-co-ban-lam-viec-voi-repository.html
					
					http://ndpsoftware.com/git-cheatsheet.html#loc=local_repo;
					
					
	git pull = fit fetch + git merge				

-- 	git init : Tạo repos trên folder muốn lưu code ( qua terminal, cmd)
-- 	git clone + https://github.com/KyL-95/de-mo-kyl.git : lấy code từ trên mạng về
-- 	git pull origin main : đồng bộ từ trên remote origin về máy với phiên bản mới nhất trong nhánh main( sau khi merge)
	tự động update code 
-- 	git add : Đẩy code vào staging area trên local
	git add *.c    :   Thêm tất cả các file có phần mở rộng .c
	git commit
		git commit -a : commit luôn ko cần add .
	git push	
-- 	git diff : xem sự thay đổi sau khi update
-- 	git branch : check xem đang ở nhánh nào
-- 	git branch branch_name : tạo nhánh làm việc độc lập trên máy
	git checkout branch_name : đổi sang nhánh ... để làm việc
	git checkout -b branch_name : tạo mới một branch và chuyển sang branch đó làm việc
	
-- 	git branch -d develop : delete branch develop	
-- 	git branch -remote : kiểm tra các nhánh có trên remote
--	git push <remote_name> -d <branch_name> : delete branch on remote as name origin
-- 	git push origin --all : Đẩy tất cả các nhánh ở local lên server có tên origin

		-------------- ADVANCE -----------------

-- 	git stash : Lưu thay đổi mà bạn không muốn commit ngay (Tạm ẩn nó đi)
	git stash pop : Lấy ra, hiện thị các file đã stash trước đó

-- 	git reset file_name : rollback lại lệnh 'git add' (Xóa file khỏi vùng staging)
-- 	git rm file_name : remove file khỏi git (file đã commit) trên repo local



	----------------------------------
*** Các bước :
+ lấy code mới về sửa: (github đã có sẵn project và respon chứa nó)
		
	.git clone 
	.git branch new_branch_name : create a new branch
	.git checkout branch_name : chuyển sang làm việc trên branch mới để
không ảnh hưởng tới code chung(main)

	coding . . . 
  - đẩy code sau khi sửa lên:
	.git add
	.git commit -m "status"
	.git push -u origin branch_name : sẽ tạo mới branch tương ứng trên github remote và đẩy code lên
	.git push --force origin + tên branch : ghi đè toàn bộ một nhánh ở remote bởi một nhánh ở local 

	
+	 Lấy code về sau khi update
	. git fetch <remote> : lấy tất cả branch từ remote
		git branch test origin/test : tạo mới branch test ở local từ branch test trên remote
	
	. git fetch <remote> <branch> : lấy branch chỉ định về local
	
	. git pull origin main
	
	----------------------------------
	
+ đẩy code mới từ local lên github
	*C1 :  Khi chưa có repo trên github
		- Tạo mới repo trên github
		- git init 
		- coding
		- git status :  check file trong repos của máy
		- git add ...	
		- git commit 
		// - git branch -M main
		- đẩy code lên remote 
		+ git remote add origin https://github.com/KyL-95/FinalTest.git -- đặt tên cho url ... trên remote là origin 
		+ git push origin master	: push code ở nhánh master lên remote origin // 
		
	or	git push https://github.com/KyL-95/FinalTest.git branch_name  // ko cần dùng git remote ...
	*C2 :  Khi có sẵn repo trên github
		- Tạo folder để clone repo trống đó về local
		- git clone "link"
		- coding
		- git add .
		- git commit
		- git push origin master 
 	----------------------------------
	Khi xảy ra lỗi xung đột dữ liệu ko merge đc trên github:(do nhiều ng cùng fix 1 chỗ)
- merge main tới branch hiện tại:
	. git merge main
	
	-------------------------------
	
