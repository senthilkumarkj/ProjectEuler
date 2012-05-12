class Problem53

	def n_c_r(n,r)
		fact(n)/(fact(r)*fact(n-r))
	end

	def fact(n)
		if n==0 || n==1
			return 1
		else
			return n * fact(n-1)
		end
	end
end

p = Problem53.new
count = 0
for i in 1..100
	for j in 1..i
		count = count + 1 if p.n_c_r(i,j) > 1000000
	end
end
puts count