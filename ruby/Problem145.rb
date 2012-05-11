class Problem145

	def isReversible?(n)
		n_reverse = n.to_s.reverse.to_i
		return false if n.to_s.length != n_reverse.to_s.length
		sum = n + n_reverse
		(['0','2','4','6','8'] & sum.to_s.split('')).empty?
	end

end

p = Problem145.new
count = 0
for i in 1..1000000000
	puts i if i%10000 == 0
	count = count + 1 if p.isReversible?(i)
end
puts count