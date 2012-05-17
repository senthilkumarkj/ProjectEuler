class Problem34

	@@fact = {}

	def self.fact(n)
		if n == 0 || n == 1
			1
		else
			n * fact(n-1)
		end
	end

	def self.init_fact
		for i in 0..9
			@@fact[i] = fact(i)
		end
	end

	def sum_of_fact_digits(n)
		n_digits = n.to_s.split('').sort
		sum = 0
		n_digits.each{ |d|
			f = @@fact[d.to_i]
			if sum + f <= n
				sum = sum + f
			else
				break
			end
		}
		n == sum
	end

end

Problem34.init_fact
p = Problem34.new
sum = 0
for i in 10..100000
	if p.sum_of_fact_digits(i)
		sum = sum + i 
		puts i
	end
end
puts "sum = "+sum.to_s