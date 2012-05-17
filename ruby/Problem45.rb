class Problem45

	def triangle_number(n)
		n * (n+1) / 2
	end

	def pentagonal_number(n)
		n * (3*n-1) / 2
	end

	def hexagonal_number(n)
		n * (2*n-1)
	end

end

p = Problem45.new

tri_nos = []
hex_nos = []
pen_nos = []

for i in 1..100000
	tri_nos << p.triangle_number(i)
	pen_nos << p.pentagonal_number(i)
	hex_nos << p.hexagonal_number(i)
end

puts tri_nos & pen_nos & hex_nos
