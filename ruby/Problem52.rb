class Problem52

	def containsSameDigits?(x,y)
		x_digits = x.to_s.split('')
		y_digits = y.to_s.split('')
		x_digits.length == y_digits.length && (x_digits & y_digits).length == x_digits.length
	end

	def x_to_6x(limit)
		i =1 
		while(i<=limit)
			puts i if i % 1000 == 0
			if containsSameDigits?(i,2*i) && containsSameDigits?(i,2*i) && containsSameDigits?(i,3*i) && containsSameDigits?(i,4*i) && containsSameDigits?(i,5*i) && containsSameDigits?(i,6*i)
				return i
			end
			i = i + 1
		end
	end
end

p = Problem52.new
puts p.x_to_6x(1000000)