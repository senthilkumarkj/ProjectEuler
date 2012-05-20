class Problem40

	def irrational_number(limit)
		n = ''
		for i in 1..limit
			n = n + i.to_s
			break if n.length > limit
		end
		n
	end

end

p = Problem40.new
n = p.irrational_number(1000000)
n = n.chars.to_a
puts n[0].to_i * n[9].to_i * n[99].to_i * n[999].to_i * n[9999].to_i * n[99999].to_i * n[999999].to_i